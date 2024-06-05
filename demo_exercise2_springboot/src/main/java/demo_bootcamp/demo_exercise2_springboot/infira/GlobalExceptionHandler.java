package demo_bootcamp.demo_exercise2_springboot.infira;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

// @RestControllerAdvice // @ContollerAdvice + @ResponseBody
public class GlobalExceptionHandler {

  @ExceptionHandler(NumberFormatException.class) // catch
  public ErrorResponse numberFormatExceptionHandler(NumberFormatException e) {
    return ErrorResponse.of(ErrorCode.NFE.getCode(), ErrorCode.NFE.getDesc());
  }

  @ExceptionHandler(NullPointerException.class)
  public ErrorResponse nullPointerExceptionHandler(NullPointerException e) {
    return ErrorResponse.of(ErrorCode.NPE.getCode(), ErrorCode.NPE.getDesc());
  }

  @ExceptionHandler(ArithmeticException.class)
  public ErrorResponse arithmeticExceptionHandler(ArithmeticException e) {
    return ErrorResponse.of(ErrorCode.AE.getCode(), ErrorCode.AE.getDesc());
  }

  @ExceptionHandler(BusinessRuntimeException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  public ErrorResponse businessRuntimeExceptionHandler(
      BusinessRuntimeException e) {
    return new ErrorResponse(e.getCode(), e.getMessage());
  }
  // Alternative
  // @ExceptionHandler({NumberFormatException.class, NullPointerException.class,
  // ArithmeticException.class})
  // public ErrorResponse exceptionHandler(RuntimeException e) {
  // if (e instanceof NumberFormatException) {
  // return ErrorResponse.of(ErrorCode.NFE.getCode(), ErrorCode.NFE.getDesc());
  // } else if (e instanceof NullPointerException) {
  // return ErrorResponse.of(ErrorCode.NPE.getCode(), ErrorCode.NPE.getDesc());
  // } else if (e instanceof ArithmeticException) {
  // return ErrorResponse.of(ErrorCode.AE.getCode(), ErrorCode.AE.getDesc());
  // }
  // return ErrorResponse.of(99999, "Unhandled Exception.");
  // }

}