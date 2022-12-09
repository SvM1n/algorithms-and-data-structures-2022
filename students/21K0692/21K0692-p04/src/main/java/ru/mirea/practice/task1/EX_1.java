package EX1;

public class EX_1 {

        public enum  Seasons {
            Fall(10),
            Winter(-20),
            Spring(15),
            Summer(25){
                public void getDescription() {
                    System.out.println("Жаркое время года");
                }
            }
            ;
            private double temp =0;
            Seasons (double temp){
                temp = this.temp;
            }
            public double getAverageTemperature() {
                return temp;
            }
            public void setAverageTemperature(double temp) {
                this.temp = temp;
            }
            public void getDescription() {
                System.out.println("Холодное время года");
            }
            @Override
            public String toString() {
                return "{" +
                        "averageTemperature = " + temp + "\u00B0C" +
                        '}';
            }

        }

}
