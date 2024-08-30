package com.devaraj_hotel_booking.repository;

import com.devaraj_hotel_booking.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {
    @Query("SELECT distinct r.roomType from Room r")
    List<String> findDistinctRoomTypes();
}
