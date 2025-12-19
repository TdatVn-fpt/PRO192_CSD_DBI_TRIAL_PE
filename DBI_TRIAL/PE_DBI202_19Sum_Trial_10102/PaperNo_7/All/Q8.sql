CREATE OR ALTER PROC TotalAMount
    @OrderID VARCHAR(20),
    @t FLOAT OUTPUT
AS
BEGIN
    SET NOCOUNT ON;
    SELECT @t = SUM(SalePrice * Quantity * (1 - Discount))
    FROM OrderDetails
    WHERE OrderID = @OrderID;
END;
GO


