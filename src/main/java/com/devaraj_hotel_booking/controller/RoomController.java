package com.devaraj_hotel_booking.controller;

import com.devaraj_hotel_booking.model.Room;
import com.devaraj_hotel_booking.response.RoomResponse;
import com.devaraj_hotel_booking.service.IRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rooms")
public class RoomController {

    private final IRoomService roomService;

    @PostMapping("/add/new-room")
    public ResponseEntity<RoomResponse> addNewRoom(@RequestParam("photo") MultipartFile photo, @RequestParam("roomType") String roomType, @RequestParam("roomPrice") BigDecimal roomPrice) throws SQLException, IOException {
        Room savedRoom = roomService.addNewRoom(photo, roomType, roomPrice);

        RoomResponse response = new RoomResponse(savedRoom.getId(), savedRoom.getRoomType(), savedRoom.getRootPrice());

        return ResponseEntity.ok(response);
    }

//    crete the get all rooms code
    @GetMapping("/room/types")
    public List<String> getRoomTypes(){
        return roomService.getAllRoomType();
    }
}
