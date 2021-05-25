-- SHOW DATABASES;
CREATE DATABASE movies;
-- USE movies;
DESCRIBE movie;
DESCRIBE rating;
DESCRIBE reviewer;
SELECT * FROM movies.movie;
SELECT * FROM movies.rating;
SELECT * FROM movies.reviewer;

-- -------------------------------------------------------------------------------------------------------
-- Exercise 1
-- Find the titles of all movies directed by Steven Spielberg.
--                      title
-- 1                     E.T.
-- 2  Raiders of the Lost Ark
SELECT title FROM movie WHERE director LIKE "%Spielberg%";

-- -------------------------------------------------------------------------------------------------------
-- Exercise 2
-- Find all years that have a movie that received a rating of 4 or 5, and sort them in increasing order.
--   year
-- 1 1937
-- 2 1939
-- 3 1981
-- 4 2009
SELECT DISTINCT year FROM movie INNER JOIN rating ON movie.mID=rating.mID WHERE rating.stars>3 ORDER BY year ASC;

-- -------------------------------------------------------------------------------------------------------
-- Exercise 3
-- Find the titles of all movies that have no ratings.
--       title
-- 1 Star Wars
-- 2   Titanic
SELECT title FROM movie LEFT JOIN rating ON movie.mID=rating.mID WHERE stars IS NULL ORDER BY year ASC;

-- -------------------------------------------------------------------------------------------------------
-- Exercise 4
-- Some reviewers didn’t provide a date with their rating. Find the names of all reviewers who have ratings with a NULL value for the date.
--            name
-- 1  Daniel Lewis
-- 2 Chris Jackson
SELECT name FROM reviewer RIGHT JOIN rating ON reviewer.rID=rating.rID WHERE ratingDate IS NULL;

-- -------------------------------------------------------------------------------------------------------
-- Exercise 5
-- Write a query to return the ratings data in a more readable format: reviewer name, movie title, stars, and ratingDate. 
-- Also, sort the data, first by reviewer name, then by movie title, and lastly by number of stars.

--                 name                   title stars ratingdate
--  1      Ashley White                    E.T.     3 2011-01-02
--  2   Brittany Harris Raiders of the Lost Ark     2 2011-01-30
--  3   Brittany Harris Raiders of the Lost Ark     4 2011-01-12
--  4   Brittany Harris      The Sound of Music     2 2011-01-20
--  5     Chris Jackson                    E.T.     2 2011-01-22
--  6     Chris Jackson Raiders of the Lost Ark     4       <NA>
--  7     Chris Jackson      The Sound of Music     3 2011-01-27
--  8      Daniel Lewis              Snow White     4       <NA>
--  9  Elizabeth Thomas                  Avatar     3 2011-01-15
--  10 Elizabeth Thomas              Snow White     5 2011-01-19
--  11    James Cameron                  Avatar     5 2011-01-20
--  12    Mike Anderson      Gone with the Wind     3 2011-01-09
--  13   Sarah Martinez      Gone with the Wind     2 2011-01-22
--  14   Sarah Martinez      Gone with the Wind     4 2011-01-27

SELECT name, title, stars, ratingDate AS ratingdate FROM rating 
	INNER JOIN reviewer ON reviewer.rID=rating.rID 
    INNER JOIN movie ON movie.mID=rating.mID
    ORDER BY name,  title,  stars ASC;

-- -------------------------------------------------------------------------------------------------------
-- Exercise 6
-- For all cases where the same reviewer rated the same movie twice 
-- and gave it a higher rating the second time, 
-- return the reviewer’s name and the title of the movie.

--             name              title
-- 1 Sarah Martinez Gone with the Wind
SELECT name, title
FROM Movie
INNER JOIN Rating AS R1 USING(mId)
INNER JOIN Rating AS R2 USING(rId, mId)
INNER JOIN Reviewer USING(rId)
WHERE R1.ratingDate < R2.ratingDate AND R1.stars < R2.stars;

SELECT name, title
FROM Movie
INNER JOIN Rating AS R1 ON movie.mID=R1.mID
INNER JOIN Rating AS R2 USING(rId)
INNER JOIN Reviewer USING(rId)
WHERE R1.mId = R2.mId AND R1.ratingDate < R2.ratingDate AND R1.stars < R2.stars;
    
-- -------------------------------------------------------------------------------------------------------
-- Exercise 7 (Optional)
-- For each movie that has at least one rating, find the highest number of stars that movie received. 
-- Return the movie title and number of stars. Sort by movie title.

--                     title max
-- 1                  Avatar   5
-- 2                    E.T.   3
-- 3      Gone with the Wind   4
-- 4 Raiders of the Lost Ark   4
-- 5              Snow White   5
-- 6      The Sound of Music   3
    
    
    
    