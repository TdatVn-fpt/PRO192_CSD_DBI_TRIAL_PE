USE PE_Demo_S2019;
GO

WITH CountProducts AS (
    SELECT 
        sc.ID AS SubCategoryID,
        COUNT(p.ID) AS NumberOfProducts
    FROM SubCategory sc
    JOIN Product p ON sc.ID = p.SubCategoryID
    GROUP BY sc.ID
)
SELECT * FROM (
    SELECT TOP 5 * 
    FROM CountProducts
    ORDER BY NumberOfProducts DESC
) AS Top5High
UNION ALL
SELECT * FROM (
    SELECT TOP 5 * 
    FROM CountProducts
    ORDER BY NumberOfProducts ASC
) AS Top5Low
ORDER BY NumberOfProducts DESC;
