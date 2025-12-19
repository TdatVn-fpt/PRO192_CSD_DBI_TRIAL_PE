SELECT 
    od.ProductID,
    p.ProductName,
    od.Quantity
FROM OrderDetails od
JOIN Product p ON p.ID = od.ProductID
WHERE od.Quantity = (
    SELECT MAX(Quantity) FROM OrderDetails
)
ORDER BY od.ProductID;
