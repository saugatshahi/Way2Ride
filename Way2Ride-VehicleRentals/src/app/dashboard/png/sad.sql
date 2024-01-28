-- CREATE DATABASE paschimanchal_english_high;
USE paschimanchal_english_high;

-- CREATE TABLE fees (
--     class VARCHAR(256) PRIMARY KEY,
--     amount INT
-- );

-- CREATE TABLE student (
--     Student_id INT PRIMARY KEY,
--     Student_Name VARCHAR(256),
--     dateofbirth DATE,
--     gender VARCHAR(255),
--     ward VARCHAR(255),
--     district VARCHAR(256),
--     province VARCHAR(150),
--     guardiansname VARCHAR(255),
--     guardiansnumber VARCHAR(255)
-- );

-- INSERT INTO Student (Student_id, Student_Name, dateofbirth, gender, ward, district, province, guardiansname, guardiansnumber)
-- VALUES
--     (1, 'Raju Shrestha', '1997-05-15', 'Male', '5', 'Kathmandu', 'Province 3', 'Maya Shrestha', '9876543210'),
--     (2, 'Sumana Raj', '1995-09-20', 'Female', '2', 'Kaski', 'Gandaki', 'Rajendra Raj', '9876543211'),
--     (3, 'Ashish Sharma', '2000-03-10', 'Male', '3', 'Sunsari', 'Koshi', 'Sundar Sharma', '9876543212');











-- CREATE TABLE teacher (
--     Teacher_id INT PRIMARY KEY,
--     Teacher_Name VARCHAR(256),
--     dateofbirth DATE,
--     gender VARCHAR(255),
--     ward VARCHAR(255),
--     district VARCHAR(256),
--     province VARCHAR(150),
--     phonenumber VARCHAR(10),
--     salary INT
-- );

-- CREATE TABLE payment (
--     student_id INT,
--     amount INT,
--     paymentdate DATE,
--     FOREIGN KEY (student_id) REFERENCES student(Student_id)
-- );

-- CREATE TABLE subject (
--     subject_id INT PRIMARY KEY,
--     subject_name VARCHAR(255),
--     class VARCHAR(256),
--     FOREIGN KEY (class) REFERENCES fees(class)
-- );

-- CREATE TABLE attendance (student_id INT,subject_id INT,date_of_attendance DATE,status VARCHAR(255),
-- FOREIGN KEY (student_id) REFERENCES student(Student_id),
-- FOREIGN KEY (subject_id) REFERENCES subject(subject_id)
-- );

-- CREATE TABLE resultexam (student_id INT, subject_id INT,date_of_exam DATE,score INT,FOREIGN KEY (student_id) REFERENCES student(Student_id),
-- FOREIGN KEY (subject_id) REFERENCES subject(subject_id));

-- CREATE TABLE events (event_name VARCHAR(255), date_of_event DATE, location VARCHAR(255), PRIMARY KEY (event_name, date_of_event));

-- CREATE TABLE book (book_id INT PRIMARY KEY, book_title NVARCHAR(255));

-- CREATE TABLE author (author_id INT PRIMARY KEY, book_id INT, author_name NVARCHAR(255), FOREIGN KEY (book_id) REFERENCES book(book_id));

-- CREATE TABLE libraryrecord (book_id INT,author_id INT,issue_date DATE,return_date DATE,FOREIGN KEY (book_id) REFERENCES book(book_id),
-- FOREIGN KEY (author_id) REFERENCES author(author_id));


/*
  INSERT QUERIES TO ASSERT DATA INTO THE GIVEN SETS OF TABLE
*/


-- INSERT INTO fees (class, amount) VALUES
-- ('Nursery', 2000),
-- ('LKG', 2500),
-- ('Class 1', 3000),
-- ('Class 2', 3000),
-- ('Class 3', 3500),
-- ('Class 4', 3500),
-- ('Class 5', 4000),
-- ('Class 6', 4500),
-- ('Class 7', 4500),
-- ('Class 8', 5000),
-- ('Class 9', 5500),
-- ('Class 10', 6000);

-- INSERT INTO Student (Student_id, Student_Name, dateofbirth, gender, ward, district, province, guardiansname, guardiansnumber)
-- VALUES
--     (1, 'Raju Shrestha', '1997-05-15', 'Male', '5', 'Kathmandu', 'Province 3', 'Maya Shrestha', '9876543210'),
--     (2, 'Sumana Raj', '1995-09-20', 'Female', '2', 'Kaski', 'Gandaki', 'Rajendra Raj', '9876543211'),
--     (3, 'Ashish Sharma', '2000-03-10', 'Male', '3', 'Sunsari', 'Koshi', 'Sundar Sharma', '9876543212');

-- INSERT INTO teacher (Teacher_id, Teacher_Name, dateofbirth, gender, ward, district, province, phonenumber, salary) VALUES
-- (101, 'Mrs. Sharmila Shrestha', '1985-12-03', 'Female', '7', 'Kathmandu', 'Bagmati', '9878765432', 50000),
-- (102, 'Mr. Harihar Chaulagai', '1978-06-25', 'Male', '4', 'Bhaktapur', 'Bagmati', '9845678901', 55000),
-- (103, 'Miss Divya Chhetri', '1990-09-15', 'Female', '1', 'Kaski', 'Gandaki', '9812345678', 48000);

-- INSERT INTO payment (student_id, amount, paymentdate) VALUES
-- (1, 5000, '2023-01-10'),
-- (2, 6000, '2023-01-12'),
-- (3, 7000, '2023-01-15');

-- INSERT INTO subject (subject_id, subject_name, class) VALUES
-- (1, 'Mathematics', 'Class 8'),
-- (2, 'Physics', 'Class 9'),
-- (3, 'Chemistry', 'Class 10');

-- INSERT INTO attendance (student_id, subject_id, date_of_attendance, status) VALUES
-- (1, 1, '2023-01-10', 'Present'),
-- (2, 2, '2023-01-12', 'Present'),
-- (3, 3, '2023-01-15', 'Present');

-- INSERT INTO resultexam (student_id, subject_id, date_of_exam, score) VALUES
-- (1, 1, '2023-01-20', 85),
-- (1, 2, '2023-01-21', 78),
-- (1, 3, '2023-01-22', 91),
-- (2, 1, '2023-01-20', 62),
-- (2, 2, '2023-01-21', 58),
-- (2, 3, '2023-01-22', 81),
-- (3, 1, '2023-01-20', 78),
-- (3, 2, '2023-01-21', 65),
-- (3, 3, '2023-01-22', 61);

-- INSERT INTO events (event_name, date_of_event, location) VALUES
-- ('Annual Sports Meet', '2023-02-15', 'Sports Ground'),
-- ('Science Exhibition', '2023-03-10', 'Science Hall'),
-- ('Cultural Night', '2023-04-05', 'Auditorium');

-- INSERT INTO book (book_id, book_title) VALUES
-- (1, 'आधुनिक युगको चिन्ह'),
-- (2, 'सपना हरायो'),
-- (3, 'समाजशास्त्रिक विचारका कागजात');

-- INSERT INTO author (author_id, book_id, author_name) VALUES
-- (101, 1, 'सञ्जीव पौडेल'),
-- (102, 2, 'अर्जुन थापा'),
-- (103, 3, 'निरज जोशी');

-- INSERT INTO LibraryRecords (book_id, author_id, issue_date, return_date)
-- VALUES
-- (1, 101, '2023-01-05', '2023-01-20'),
-- (2, 102, '2023-01-10', '2023-01-25'),
-- (3, 103, '2023-01-15', '2023-01-30');

update fees set amount = amount / 1.20 WHERE class IN (
'Nursery','KG','Class 1','Class 2','Class 3','Class 4','Class 5','Class 6', 'Class 7', 'Class 8', 'Class 9', 'Class 10');


-- Insert data with different absent patterns for students, ordered by student_id
-- INSERT INTO attendance (student_id, subject_id, date_of_attendance, status)
-- SELECT
--     CASE
--         WHEN s.student_name = 'Raju Shrestha' THEN 1
--         WHEN s.student_name = 'Suman Raj' THEN 2
--         WHEN s.student_name = 'Ashish Sharma' THEN 3
--     END AS student_id,
--     FLOOR(1 + RAND() * 3) AS subject_id,  -- Random subject_id between 1 and 3
--     DATE_FORMAT(DATE_ADD('2024-01-01', INTERVAL days_ago DAY), '%Y-01-%d') AS date_of_attendance,
--     CASE
--         WHEN s.student_name = 'Raju Shrestha' AND days_ago BETWEEN 1 AND 12 THEN 'Absent'  -- More absent for Raju Shrestha
--         WHEN s.student_name IN ('Suman Raj', 'Ashish Sharma') AND days_ago BETWEEN 1 AND 6 THEN 'Present' -- More present for Suman Raj and Ashish Sharma
--         ELSE 'Absent'
--     END AS status
-- FROM
--     (SELECT 'Raju Shrestha' AS student_name
--      UNION ALL SELECT 'Suman Raj'
--      UNION ALL SELECT 'Ashish Sharma') s
-- CROSS JOIN
--     (SELECT (units) AS days_ago
--      FROM
--          (SELECT 1 AS units
--           UNION ALL SELECT 2 UNION ALL SELECT 3 UNION ALL SELECT 4 UNION ALL SELECT 5 UNION ALL
--           SELECT 6 UNION ALL SELECT 7 UNION ALL SELECT 8 UNION ALL SELECT 9 UNION ALL SELECT 10 UNION ALL
--           SELECT 11 UNION ALL SELECT 12) units) day_generator
-- ORDER BY student_id, date_of_attendance;


-- Delete students absent for more than 10 consecutive days (irrespective of subject) 
-- DELETE FROM attendance
-- WHERE student_id IN (
--      SELECT student_id
--      FROM (
--          SELECT student_id,
--                 MIN(date_of_attendance) AS first_absent_date,
--                 MAX(date_of_attendance) AS last_absent_date
--          FROM attendance
--          WHERE status = 'Absent'
--          GROUP BY student_id
--          HAVING DATEDIFF(MAX(date_of_attendance), MIN(date_of_attendance)) >= 10
--      ) AS subquery
-- );

-- CREATE TABLE enrollment (
--     enrollment_id INT AUTO_INCREMENT PRIMARY KEY,
--     student_id INT,
--     class VARCHAR(256),
--     enrollment_date DATE,
--     FOREIGN KEY (student_id) REFERENCES student(Student_id),
--     FOREIGN KEY (class) REFERENCES fees(class)
-- );

-- INSERT INTO student (Student_id, Student_Name, dateofbirth, gender, ward, district, province, guardiansname, guardiansnumber)
-- VALUES
--     (4, 'Aryan Basnet', '2000-01-23', 'Male', '4', 'Bhaktapur', 'Bagmati', 'Ramchandra Basnet', '9876543214');

-- INSERT INTO enrollment (enrollment_id, student_id, class, enrollment_date)
-- VALUES
--     (1, 4, 'Class 10', '2024-01-28');

-- INSERT INTO payment (student_id, amount, paymentdate)
-- VALUES
--     (4, 7200, '2024-01-28');

-- INSERT INTO resultexam (student_id, subject_id, date_of_exam, score) VALUES 
-- (4, 1, '2023-01-20', 85), 
-- (4, 2, '2023-01-21', 78), 
-- (4, 3, '2023-01-22', 98);

-- Calculate total marks and overall percentage for each student for subjects 1, 2, and 3
-- SELECT
--     student_id,
--     SUM(CASE WHEN subject_id = 1 THEN score ELSE 0 END +
--         CASE WHEN subject_id = 2 THEN score ELSE 0 END +
--         CASE WHEN subject_id = 3 THEN score ELSE 0 END) AS total_marks,
--     ROUND(SUM(CASE WHEN subject_id = 1 THEN score ELSE 0 END +
--         CASE WHEN subject_id = 2 THEN score ELSE 0 END +
--         CASE WHEN subject_id = 3 THEN score ELSE 0 END) / 3, 2) AS overall_percentage
-- FROM
--     resultexam
-- WHERE
--     subject_id IN (1, 2, 3)
-- GROUP BY
--     student_id
-- ORDER BY
--     student_id;


-- START TRANSACTION;

-- UPDATE resultexam
-- SET score = ROUND(score * 0.9, 2);

-- COMMIT;




