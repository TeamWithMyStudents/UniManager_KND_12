package ua.knd12.service.impl;
import ua.knd12.model.User;
import ua.knd12.service.UserService;

import java.util.*;
import java.text.Collator;

public abstract class UserServiceImpl implements UserService {
    protected static User[] initialArray;
    protected List repository;
    protected int counter = repository.size();


    public UserServiceImpl(User[] initialArray) {
        this.initialArray = initialArray;
        this.repository = new ArrayList<>();
    }

    public void add(User u) {
        if (u!=null)
            repository.add(u);
        else
            System.out.println("Ви не можете додати пустого користувача");
    }

    public void delete(int id) {
        if (repository.get(id)!=null)
            repository.remove(id);
        else
            System.out.println("Немаэ такого користувача");
    }


    public List getAll() {
        return repository;
    }

    public static User[] getInitialArray() {
        return initialArray;
    }

    public User[] findByName(String query) {
        if (initialArray == null || query == null) return new User[0]; //перевірка юзерів та запиту, якщо null то повертаємо 0, робиться для запобігання крашу коду
        Locale uaLocale = new Locale("uk", "UA");
        String lowerQuery = query.toLowerCase(uaLocale);

        User[] result = new User[initialArray.length]; // тут зберігаємо вже відфільтрованих юзерів які співпадають з запитом

        int foundUsers = 0; //кількість знайдених юзерів
        for (User user : initialArray) {
            if (user != null && user.getName() != null && user.getName().contains(lowerQuery)) {
                result[foundUsers++] = user;
            }

        }return Arrays.copyOf(result, foundUsers); //повертаємо обрізаний масив result і foundUser
    }
       public User[] sortBySurname(){
        Collator uaCollator = Collator.getInstance(new Locale("uk", "UA"));
        uaCollator.setStrength(Collator.PRIMARY);// ігнор регістру

        Arrays.sort(initialArray, 0, counter, new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {

                if (user1 == null || user1.getSurname() == null) return 1;// переносить вперед
                if (user2 == null || user2.getSurname() == null) return -1;// переносить не кінець

                return uaCollator.compare(user1.getSurname(), user2.getSurname());
            }
        });
           return Arrays.copyOf(initialArray, counter);
    }

}
