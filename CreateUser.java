public class CreateUser {

    public static void main(String [] args){

        User User1 = new User.UserBuilder()
                .firstName("Steven")
                .lastName("Universe")
                .address("Beach City")
                .email("steven.universe@gmail.com")
                .phone("321-333-9876")
                .age(19)
                .build();

        User1.displayUserInfo();

        User User2 = new User.UserBuilder()
                .firstName("Michael")
                .lastName("Jordan")
                .address("Los Angeles")
                .email("its.michael@yahoo.com")
                .phone("123-777-4321")
                .age(44)
                .build();

        User2.displayUserInfo();

    }

}
