SELECT 
    sc.ID AS SubCategoryID,
    sc.SubCategoryName,
    COUNT(p.ID) AS NumberOfProducts
FROM SubCategory sc
JOIN Product p ON sc.ID = p.SubCategoryID
GROUP BY sc.ID, sc.SubCategoryName
HAVING COUNT(p.ID) > 100
ORDER BY NumberOfProducts DESC;
