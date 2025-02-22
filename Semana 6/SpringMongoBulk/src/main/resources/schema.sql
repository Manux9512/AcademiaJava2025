DROP TABLE members IF EXISTS;

CREATE TABLE members (
    memberId VARCHAR(20) NOT NULL,
    fullnameName VARCHAR(20),
    email VARCHAR(60),
    subscriptionTier VARCHAR(20),
    cost VARCHAR(30)
);
