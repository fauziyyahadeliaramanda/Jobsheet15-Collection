import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mahasiswa10 {
    private static final Arrays Collections = null;
    private static final Object[] mahasiswas = null;
    static String nim;
    static String nama;
    String notelp;

    public Mahasiswa10() {
    }
    public Mahasiswa10 (String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }
    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }
    public class ListMahasiswa10 {
        List<Mahasiswa10> mahasiswas = new ArrayList<>();

        public void tambah(Mahasiswa10... mahasiswa) {
            mahasiswas.addAll(Arrays.asList(mahasiswa));
        }
        public void hapus(int index) {
            mahasiswas.remove(index);
        }
        public void update(int index, Mahasiswa10 mhs) {
            mahasiswas.set(index, mhs);
        }

        public void tampil() {
            mahasiswas.stream().forEach(mhs -> {
                System.out.println("" +mhs.toString());
            });
        }
    }
  int binarySearch(String nim) {
    int low = 0;
    int high = mahasiswas.size() -1;

    while(low <= high) {
        int mid = low +(high - low) / 2;
        Mahasiswa10 mhs = mahasiswas.get(mid);

        if(mhs.nim.equals(nim)){
            return mid;
        } else if (mhs.nim.compareTo(nim) < 0) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return -1;
  }
  public void sortByNimAsc() {
    Collections.sort(mahasiswas, (mhs1, mhs2) -> mhs1.nim.compareTo (mhs2.nim));
  }
  public void sortByNimDesc() {
    Collections.sort(mahasiswa, (mhs1, mhs2)-> mhs.nim.compareTo (mhs1.nim));
  }
   public static void main(String [] args) {
    Mahasiswa10 lm = new Mahasiswa10();
    Mahasiswa10 m = new Mahasiswa10 ("201234", "Noureen","021xx1");
    Mahasiswa10 m1 = new Mahasiswa10 ("201235", "Akhleena","021xx2");
    Mahasiswa10 m2 = new Mahasiswa10 ("201236", "Shannum","021xx3");

    lm.tambah(m, m1, m2);

    lm.tampil();

    lm.update(lm.linearSerach("201235"), new Mahasiswa10("201235", "Akhleena Lela", "021xx2"));
    System.out.println(" ");

    lm.tampil();
   }
 }
