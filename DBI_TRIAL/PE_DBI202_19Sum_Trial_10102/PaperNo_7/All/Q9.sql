

CREATE OR ALTER TRIGGER InsertSubCategory
ON SubCategory
AFTER INSERT
AS
BEGIN
    SET NOCOUNT ON;

    SELECT 
        i.SubCategoryName,
        c.CategoryName
    FROM inserted i
    JOIN Category c ON i.CategoryID = c.ID;
END;
GO


