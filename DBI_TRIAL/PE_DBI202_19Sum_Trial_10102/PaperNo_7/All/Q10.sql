
DECLARE @NewCategoryID INT;

INSERT INTO Category(CategoryName)
VALUES ('Sports');

SET @NewCategoryID = SCOPE_IDENTITY();

INSERT INTO SubCategory(SubCategoryName, CategoryID)
VALUES ('Tennis', @NewCategoryID),
       ('Football', @NewCategoryID);
