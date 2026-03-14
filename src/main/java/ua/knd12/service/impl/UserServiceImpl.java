package ua.knd12.service.impl;
import ua.knd12.model.User;
import ua.knd12.service.UserService;

import java.util.Arrays;
import java.util.Locale;
import java.text.Collator;
import java.util.Comparator;

abstract class UserServiceImpl implements UserService {
    protected User[] initialArray;
    protected int counter = 0;


    public UserServiceImpl(User[] initialArray) {
        this.initialArray = initialArray;
    }

    public void add(User u) {

        int newSize = (initialArray.length*2)+1;
        if (initialArray.length<=counter) {
            initialArray = Arrays.copyOf(initialArray, newSize);
        }
        initialArray[counter] = u;
        counter++;
    }

    public void delete(int id) {
        int pos = initialArray.length - 1;
        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i].getId() == id) {
                initialArray[pos] = initialArray[i];
                initialArray[i] = null;
                counter--;
                pos--;
            }
        }
    }

    public void getAll() {
        for (User user : UserServiceImpl.getInitialArray()) {
            if (user != null)
                System.out.println(user);
        }
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
