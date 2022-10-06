public class Main {

    public static void main(String[] args) {
        University university1=new University();
        university1.name="Peaksoft";
        university1.yearOfStart=2020;
        university1.countOfCorpus=5;
        university1.countOfFloor=3;
        university1.country="Kyrgyzstan";
        System.out.println(university1.name);
        System.out.println(university1.yearOfStart);
        System.out.println(university1.countOfCorpus);
        System.out.println(university1.countOfFloor);
        System.out.println(university1.country);
        university1.teach();

        University university2=new University();
        university2.name="Ala-Too";
        university2.yearOfStart=1990;
        university2.countOfCorpus=10;
        university2.countOfFloor=3;
        university2.country="Kyrgyzstan";
        System.out.println(university2.name);
        System.out.println(university2.yearOfStart);
        System.out.println(university2.countOfCorpus);
        System.out.println(university2.countOfFloor);
        System.out.println(university2.country);
        university2.teach();

        University university3=new University();
        university3.name="МГУ";
        university3.yearOfStart=1982;
        university3.countOfCorpus=10;
        university3.countOfFloor=5;
        university3.country="Kyrgyzstan";
        System.out.println(university3.name);
        System.out.println(university3.yearOfStart);
        System.out.println(university3.countOfCorpus);
        System.out.println(university3.countOfFloor);
        System.out.println(university3.country);
        university3.teach();
    }
}


