USE SchoolDB;
SELECT * FROM students WHERE age > 20;

SELECT students.studentName, students.major from enrollments
INNER JOIN students ON enrollments.studentid = students.studentid 
WHERE enrollments.courseId = 102;

-- Hitung jumlah mahasiswa disetiap jurusan
SELECT major, COUNT(*) as jumlah_mahasiswa FROM students GROUP BY major;

-- 4.	Tampilkan nama mahasiswa yang mendapatkan nilai 'A'. 
SELECT students.studentName FROM enrollments
INNER JOIN students ON enrollments.studentid = students.studentid 
WHERE grade = 'A';

-- 5.	Tampilkan nama mata kuliah yang memiliki lebih dari 3 kredit. 
SELECT courseName FROM courses WHERE credits > 3;

-- 6.	Tampilkan nama mahasiswa yang mengambil mata kuliah "Database Systems" 
SELECT students.studentName FROM enrollments
INNER JOIN students ON enrollments.studentid = students.studentid
INNER JOIN courses ON enrollments.courseid = courses.courseid
WHERE courseName = 'Database Systems' OR courseName = 'Phisics 101';

-- Tampilkan jumlah mahasiswa yang mendapatkan nilai 'A' di setiap mata kuliah. 
SELECT courseName, COUNT(*) as jumlah_mahasiswa FROM enrollments
INNER JOIN courses ON enrollments.courseid = courses.courseid
WHERE grade = 'A' GROUP BY courseName;

-- Tampilkan nama dan usia mahasiswa yang mengambil lebih dari satu mata kuliah. 
SELECT studentName, Age, COUNT(*) as jml FROM students
INNER JOIN enrollments ON students.studentid = enrollments.studentid
INNER JOIN courses ON enrollments.courseid = courses.courseid
GROUP BY studentName, age HAVING COUNT(*) > 1;

-- 9.	Tampilkan nama mahasiswa yang mengambil mata kuliah yang memiliki lebih dari 3 kredit, diurutkan berdasarkan nama mahasiswa. 
SELECT students.studentName FROM enrollments
INNER JOIN students ON enrollments.studentid = students.studentid
INNER JOIN courses ON enrollments.courseid = courses.courseid
WHERE courses.credits > 3 ORDER BY students.studentName ASC;

-- Tampilkan nama mata kuliah beserta rata-rata nilai mahasiswa yang mengambil mata kuliah tersebut.
SELECT courses.courseName, AVG(enrollments.gradeNumber) as avg from enrollments
INNER JOIN courses ON enrollments.courseId = courses.courseId
GROUP BY  courses.courseName;
