package leetcode.java;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public double average(int[] salary) {
        int indexMin = indexMinSalary(salary);
        int indexMax = indexMaxSalary(salary);
        double result = 0;
        for(int i=0;i<salary.length;i++){
            if(i!=indexMin && i!=indexMax){
                result = result + salary[i];
            }
        }
        return result/(salary.length - 2);
    }
    public int indexMinSalary(int [] arr){
        double min = arr[0];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
     public int indexMaxSalary(int [] arr){
        double max = arr[0];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
