use jadwal_perkuliahan;

-- SELECT DISTINCT kode_dosen
-- from jadwal where kode_hari = '002';

(select kode_dosen
from jadwal WHERE kode_hari = '004') INTERSECT
(select kode_dosen from dosen WHERE nama_dosen LIKE 'A%');
