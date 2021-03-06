package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HotelClientContract {
    private Administrator hotelAdmin;
    private HotelClient client;
    private Cashier cashier;
    private Porter porter;
    private Room room;
    private String creationDate;
    private String closingDate;

    public HotelClientContract() {
    }

    public HotelClientContract(Administrator hotelAdmin,
                               HotelClient client,
                               Room room,
                               Cashier cashier,
                               Porter porter) {
        DateTimeFormatter dataTimeFormatter =
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        this.hotelAdmin = hotelAdmin;
        this.client = client;
        this.room = room;
        this.cashier = cashier;
        this.porter = porter;
        this.creationDate = LocalDateTime.now().toString();
    }

    public Administrator getHotelAdmin() {
        return hotelAdmin;
    }

    public HotelClient getClient() {
        return client;
    }

    public Room getRoom() {
        return room;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public Porter getPorter() {
        return porter;
    }

    public String getCreationDate() {
        DateTimeFormatter dateTimeFormatter =
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return creationDate;
    }

    public String getClosingDate() {
        DateTimeFormatter dateTimeFormatter =
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return closingDate;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("               ClientHotelContract                 \n");
        builder.append(" hotelAdmin: ").append(this.getHotelAdmin().getName()).append(" ");
        builder.append(" telephoneNumber: " + this.getHotelAdmin().getTelephoneNumber() + "\n");
        builder.append(" room number: ").append(this.getRoom().getNumber()).append("\n");
        builder.append(" client: " + client + "\n");
        builder.append(" cashier at reception: " + this.getCashier().getName() + "\n");
        builder.append(" attendant porter: ").append(this.getPorter().getName()).append("\n");
        builder.append(" creationDate: ").append(this.getCreationDate());

        return builder.toString();
    }

    public static class ContractBuilder {
        private Administrator nestedHotelAdmin;
        private HotelClient nestedClient;
        private Room nestedRoom;
        private Cashier nestedCashier;
        private Porter nestedPorter;

        public ContractBuilder addAdministrator(
                Administrator admin) {
            this.nestedHotelAdmin = admin;
            return this;
        }

        public ContractBuilder addClient(HotelClient client) {
            this.nestedClient = client;
            return this;
        }

        public ContractBuilder addRoom(Room room) {
            this.nestedRoom = room;
            return this;
        }

        public ContractBuilder addCashier(Cashier cashier) {
            this.nestedCashier = cashier;
            return this;
        }

        public ContractBuilder addPorter(Porter porter) {
            this.nestedPorter = porter;
            return this;
        }

        public HotelClientContract createContract() {
            return new HotelClientContract(nestedHotelAdmin,
                    nestedClient,
                    nestedRoom,
                    nestedCashier,
                    nestedPorter);
        }
    }
}
