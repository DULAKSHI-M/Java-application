package Models;

public class Rider {

    String Name;
    String Country;
    int Age;
    double Weight;
    double Height;

    public class Record {

        int No_Of_Olympic_Medals;
        double TopSpeed;
        int No_Of_National_Level_Records;

        public Record(int m, double t, int n) {
            this.No_Of_Olympic_Medals = m;
            this.TopSpeed = t;
            this.No_Of_National_Level_Records = n;
        }

        public String DisplayRecords() {
            return No_Of_Olympic_Medals + " " + TopSpeed + " " + No_Of_National_Level_Records;
        }
    }

    public Rider(String n, String c, int a, double w, double h) {
        this.Name = n;
        this.Country = c;
        this.Age = a;
        this.Weight = w;
        this.Height = h;
    }

    public double calBMI() {
        class BMI {

            double WeightMetric;
            double HightMetric;

            double BMIMetric() {
                double answer = this.WeightMetric / Math.pow(this.HightMetric, 2);
                return answer;
            }
        }
        BMI b = new BMI();
        b.HightMetric = this.Height;
        b.WeightMetric = this.Weight;

        return b.BMIMetric();
    }
}
