package org.nexus.librarymanagementsystem.book.exception;

import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.nexus.librarymanagementsystem.book.dto.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
