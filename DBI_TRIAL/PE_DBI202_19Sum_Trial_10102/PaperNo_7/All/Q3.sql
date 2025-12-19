SELECT DISTINCT 
    c.ID, 
    c.CustomerName, 
    c.Segment, 
    c.Country, 
    c.City, 
    c.State, 
    c.PostalCode, 
    c.Region
FROM Customer c
JOIN Orders o ON c.ID = o.CustomerID
WHERE c.CustomerName LIKE 'B%'
  AND o.OrderDate >= '2017-12-01'
  AND o.OrderDate <  '2018-01-01'
ORDER BY c.Segment DESC, c.CustomerName ASC;
