package J07034;

public class MonHoc {
        private String id;
        private String ten;
        private int TinChi;

        public MonHoc(String id, String ten, int TinChi) {
            this.id = id;
            this.ten = ten;
            this.TinChi = TinChi;
        }

        public String getTen() {
            return ten;
        }

        public String toString() {
            return id + " " + ten + " " + TinChi;
        }
}
