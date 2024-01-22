import java.util.Date;
class User {
    Date birthdate;
    int size;
    Photo[] photos;
    Address[] address;

    User(Date birthdate, int size, Photo[] photos, Address[] address) {
        this.birthdate = birthdate;
        this.size = size;
        this.photos = photos;
        this.address = address;
    }

}