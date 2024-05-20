package ru.practicum.shareit.booking.service;

import ru.practicum.shareit.booking.dto.BookingRequestDto;
import ru.practicum.shareit.booking.dto.BookingResponseDto;
import ru.practicum.shareit.booking.model.BookingState;

import java.util.List;

public interface BookingService {

    BookingResponseDto addBooking(Long userId, BookingRequestDto bookingDto);

    BookingResponseDto handleBooking(Long userId, Long bookingId, boolean approved);

    BookingResponseDto getBooking(Long userId, Long bookingId);

    List<BookingResponseDto> getAllBookingsForUser(Long userId, BookingState state);

    List<BookingResponseDto> getAllBookingsForUserItems(Long userId, BookingState state);
}