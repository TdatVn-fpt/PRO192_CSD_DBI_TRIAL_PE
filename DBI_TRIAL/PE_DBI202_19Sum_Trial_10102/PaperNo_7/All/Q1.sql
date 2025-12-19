CREATE TABLE Students (
    StudentID   INT         NOT NULL PRIMARY KEY,
    [Name]      NVARCHAR(50) NOT NULL,
    [Address]   NVARCHAR(200) NULL,
    Gender      CHAR(1)     NULL
);



CREATE TABLE Classes (
    ClassID     INT         NOT NULL PRIMARY KEY,
    GroupID     CHAR(6)     NULL,
    CourseID    CHAR(6)     NULL,
    NoCredits   INT         NULL,
    Slot        INT         NULL,
    Semester    CHAR(10)    NULL,
    [Year]      INT         NULL
);


CREATE TABLE Teachers (
    TeacherID   INT          NOT NULL PRIMARY KEY,
    [Name]      NVARCHAR(50) NOT NULL,
    [Address]   NVARCHAR(200) NULL,
    Gender      CHAR(1)      NULL
);


CREATE TABLE Attend (
    StudentID   INT  NOT NULL,
    ClassID     INT  NOT NULL,
    [Date]      DATE NOT NULL,
    Slot        INT  NOT NULL,
    Attend      BIT  NOT NULL,
    CONSTRAINT PK_Attend PRIMARY KEY (StudentID, ClassID, [Date], Slot),
    CONSTRAINT FK_Attend_Student FOREIGN KEY (StudentID) REFERENCES Students(StudentID),
    CONSTRAINT FK_Attend_Class   FOREIGN KEY (ClassID)   REFERENCES Classes(ClassID)
);


CREATE TABLE Teach (
    TeacherID   INT NOT NULL,
    ClassID     INT NOT NULL,
    CONSTRAINT PK_Teach PRIMARY KEY (TeacherID, ClassID),
    CONSTRAINT FK_Teach_Teacher FOREIGN KEY (TeacherID) REFERENCES Teachers(TeacherID),
    CONSTRAINT FK_Teach_Class   FOREIGN KEY (ClassID)   REFERENCES Classes(ClassID)
);
