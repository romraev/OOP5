package ru.geekbrains.lesson5.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date reservationDate, int tableNo, String name);

    void onChangeReservationTable(int oldReservationNo, Date reservationDate, int tableNo, String Name);


}
