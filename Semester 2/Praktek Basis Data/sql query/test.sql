USE test;

-- CREATE TABLE mahasiswa(
--     nim INT(2),
--     nama VARCHAR(255),
--     nomor_telepon VARCHAR(20),
--     PRIMARY KEY(nim)
-- );

-- CREATE TABLE mata_kuliah(
--     kode CHAR(3),
--     nama VARCHAR(255),
--     sks INT(1),
--     PRIMARY KEY(kode)
-- );

-- CREATE TABLE nilai(
--     id INT AUTO_INCREMENT,
--     nim INT(2),
--     kode_matakuliah CHAR(3),
--     nilai_huruf CHAR(2),
--     PRIMARY KEY(id)
-- );

-- ALTER TABLE nilai ADD FOREIGN KEY nim_idxfk (nim) REFERENCES mahasiswa (nim) ON DELETE CASCADE;
-- ALTER TABLE nilai ADD FOREIGN KEY kode_matakuliah_idxfk (kode_matakuliah) REFERENCES mata_kuliah(kode) ON DELETE CASCADE;

-- INSERT INTO mahasiswa VALUES (1, 'Ani Rahmawati', NULL),
-- (2, "Budi Raharjo", "0852525526"), 
-- (3, 'Charlie Setiabudi', '0852525527'), 
-- (4, 'Diandra Paramita', '0852525528'), 
-- (5, 'Eka Putri', '0852525529');

-- INSERT INTO mata_kuliah (kode, nama) VALUES ('BDD', 'Basis Data Dasar'), ('PBO', 'Pemrograman Berorientasi Objek'),
-- ('MMT', 'Multimedia Terapan'), ('SPK', 'Sistem Pendukung Keputusan'),
-- ('KCB', 'Kecerdasan Buatan'), ('ASD', 'Algoritma dan Struktur Data');

-- SELECT * FROM mata_kuliah WHERE kode = 'ASD';

-- UPDATE mahasiswa SET nomor_telepon = '0852525525' WHERE nim = 1;
-- SELECT mahasiswa.nama, mahasiswa.nomor_telepon FROM mahasiswa WHERE nim = 1;

-- DELETE FROM mata_kuliah WHERE kode = 'BDD';
-- SELECT * FROM mata_kuliah;

-- INSERT INTO nilai (nim, kode_matakuliah, nilai_huruf) VALUES (1, 'PBO', 'A'),
-- (1, 'ASD', 'B'), 
-- (1, 'KCB', 'C'), 
-- (1, 'MMT', 'D'), (1, 'SPK', 'E');
-- SELECT * FROM nilai;

-- UPDATE mata_kuliah SET sks = 2;
-- SELECT * FROM mata_kuliah;

DELETE FROM mata_kuliah WHERE nama = "Sistem Pendukung Keputusan";
SELECT * FROM mata_kuliah;