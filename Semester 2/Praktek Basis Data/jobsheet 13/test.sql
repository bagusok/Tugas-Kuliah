Select kelas.nama_kelas, prodi.nama_prodi 
from kelas INNER JOIN prodi on kelas.kode_prodi = prodi.kode_prodi;

SELECT k.nama_kelas, p.nama_prodi 
from kelas k INNER JOIN prodi p on p.kode_prodi = k.kode_prodi;

select j.kode_jadwal, d.nama_dosen, k.nama_kelas, h.nama_hari FROM
jadwal j inner join dosen d on d.kode_dosen = j.kode_dosen
INNER JOIN kelas k on k.kode_kelas = j.kode_kelas
INNER JOIN hari h on h.kode_hari = j.kode_hari;


select k.nama_kelas, p.nama_prodi from kelas k 
INNER JOIN prodi p on p.kode_prodi = k.kode_prodi
WHERE k.nama_kelas LIKE '%A';

select k.nama_kelas, p.nama_prodi from kelas k LEFT OUTER JOIN prodi p ON
k.kode_prodi = p.kode_prodi;


select k.nama_kelas, p.nama_prodi from kelas k LEFT OUTER JOIN prodi p ON
k.kode_prodi = p.kode_prodi WHERE p.kode_prodi is NULL;

select k.nama_kelas, p.nama_prodi from kelas k RIGHT OUTER JOIN prodi p ON
k.kode_prodi = p.kode_prodi;

select k.nama_kelas, p.nama_prodi from kelas k RIGHT OUTER JOIN prodi p ON
k.kode_prodi = p.kode_prodi UNION all SELECT k.nama_kelas, p.nama_prodi
from kelas k RIGHT OUTER JOIN prodi p on p.kode_prodi = k.kode_prodi;


select kelas.nama_kelas, prodi.nama_prodi from kelas, prodi 
WHERE kelas.kode_prodi = prodi.kode_prodi;

select k.nama_kelas, p.nama_prodi from kelas k, prodi p 
WHERE k.kode_prodi = p.kode_prodi;

select k.nama_kelas, p.nama_prodi from kelas k CROSS JOIN prodi p;

SELECT k.nama_kelas, p.nama_prodi from kelas k, prodi p;


-- -- JAWABAN TUGAS 
-- 1.	Tampilkan nama dosen berikut mata kuliah yang mereka ampu (186 baris) dengan ketentuan:
-- a.	Tidak ada data yang duplikat
-- b.	Urut berdasarkan nama dosen dari A-Z.

SELECT d.nama_dosen, m.nama_mk from jadwal j, dosen d, mk m
WHERE j.kode_dosen = d.kode_dosen AND j.kode_mk = m.kode_mk 
GROUP BY d.nama_dosen, m.nama_mk 
ORDER BY d.nama_dosen ASC;

-- Tampilkan ruang yang digunakan untuk perkuliahan pada hari 'Selasa' berikut jam-nya (79 baris) dengan ketentuan:
-- a.	Harus ditampilkan ruangan tersebut dipakai mulai dari jam berapa sampai dengan jam berapa.
-- b.	Nama kolom yang ditampilkan harus sesuai contoh di bawah.

SELECT ruang.kode_ruang, ruang.nama_ruang, hari.nama_hari, jp.jp_mulai, jp.jp_selesai
from ruang, hari, jp, jadwal
WHERE jadwal.kode_ruang = ruang.kode_ruang
GROUP BY kode_ruang, nama_ruang, nama_hari, jp_mulai, jp_selesai ORDER BY nama_hari DESC;


SELECT d.nama_dosen, m.nama_mk, j.kode_jadwal from jadwal j, dosen d, mk m
WHERE j.kode_dosen = d.kode_dosen AND j.kode_mk = m.kode_mk AND j.kode_jadwal IS NULL
GROUP BY d.nama_dosen, m.nama_mk, j.kode_jadwal
ORDER BY d.nama_dosen ASC;

-- 5.	Tampilkan nama mata kuliah berikut dosen pengampunya berikut (192 baris) yang tidak ada dosen pengampunya! Ketentuan:
-- a.	Nama Kolom harus sesuai contoh
-- b.	Anda bisa menggunakan RIGHT OUTER JOIN agar lebih mudah


SELECT m.nama_mk, d.nama_dosen from jadwal j, dosen d, mk m
WHERE j.kode_dosen = d.kode_dosen AND j.kode_mk = m.kode_mk 
GROUP BY d.nama_dosen, m.nama_mk 
ORDER BY d.nama_dosen ASC;

-- 6.	Tampilkan nama-nama dosen (88 baris) berikut jumlah jadwal mereka! Ketentuan:
-- a.	Nama kolom harus sesuai contoh
-- b.	Apabila ada dosen yang tidak mendapatkan jadwal, jumlah_jadwal_mengajarnya haruslah = 0

SELECT d.nama_dosen, COUNT(j.kode_jadwal) as jumlah_jadwal_mengajar from jadwal j, dosen d
WHERE j.kode_dosen = d.kode_dosen
GROUP BY d.nama_dosen;