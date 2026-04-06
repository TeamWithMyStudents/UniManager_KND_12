package ua.knd12.service;

public interface TeacherService extends UserService{
    void calculateTotalSalary();
    void filterByDegree(String degree);
}
