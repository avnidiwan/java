public class findGrade {
    public static void main(String[] args) {
        double marks=101;
        if(marks>100) System.out.println("INVALID MARKS");
        else if(marks>=90) System.out.println(" GRADE A");
        else if (marks>=80) System.out.println("GRADE B");
        else if(marks>=70) System.out.println("GRADE C");
        else if(marks>=60) System.out.println("GRADE D");
        else if(marks>=50) System.out.println("GRADE E");
        else if(marks>=40) System.out.println("GRADE F");
        else if(marks<40) System.out.println("FAIL");
        else{
            System.out.println("INVALID INPUT");
        }

    }
}
