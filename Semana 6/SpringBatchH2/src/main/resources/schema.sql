DROP TABLE member IF EXISTS;

CREATE TABLE member (
    memberId VARCHAR(20) NOT NULL,
    fullName VARCHAR(20),
    email VARCHAR(60),
    subscriptionTier VARCHAR(20),
    cost VARCHAR(30)
);
