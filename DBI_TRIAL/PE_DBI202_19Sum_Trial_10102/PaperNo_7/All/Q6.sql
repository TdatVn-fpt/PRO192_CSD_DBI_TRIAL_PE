USE PE_Demo_S2019;
GO

WITH ProductOrders AS (
    SELECT 
        ProductID, 
        COUNT(DISTINCT OrderID) AS NumberOfOrders
    FROM OrderDetails
    GROUP BY ProductID
),
MinOrder AS (
    SELECT 
        MIN(NumberOfOrders) AS MinOrders 
    FROM ProductOrders
)
SELECT 
    p.ID AS ProductID,
    p.ProductName,
    po.NumberOfOrders
FROM ProductOrders po
JOIN MinOrder mo 
    ON po.NumberOfOrders = mo.MinOrders
JOIN Product p 
    ON p.ID = po.ProductID
ORDER BY p.ID;
