package leetcode.java;

import java.util.List;

public class EmployeeImportance {

    class Employee{
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    int importanceSum = 0;

    public int getImportance(List<Employee> employees, int id) {
        Employee e = employees.stream().filter(employee -> employee.id == id).findFirst().orElseThrow();
        empImportanceSum(employees,e);
        return importanceSum;
    }

    Employee getById(List<Employee> list ,  int id){
        return list.stream().filter(e -> e.id == id)
                .findFirst().orElseThrow();
    }

    void empImportanceSum( List<Employee> employees,Employee e){
        importanceSum+= e.importance;
        if (e.subordinates.isEmpty()){
            return;
        }
        e.subordinates.forEach(id ->empImportanceSum(employees,getById(employees,id)));
    }

}
