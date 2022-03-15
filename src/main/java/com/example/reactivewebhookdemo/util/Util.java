package com.example.reactivewebhookdemo.util;

import com.example.reactivewebhookdemo.dtos.request.WebHookRequestDto;
import com.example.reactivewebhookdemo.dtos.response.UserDto;
import com.example.reactivewebhookdemo.model.User;
import org.springframework.beans.BeanUtils;

public class Util {

  public static UserDto getUserDto(User user) {
    UserDto userDto = new UserDto();
    BeanUtils.copyProperties(user, userDto);
    return userDto;
  }

  public static User getUserFromWebHook(WebHookRequestDto requestDto) {
    User user = new User();
    user.setName(requestDto.getPusher().getName());
    user.setEmail(requestDto.getPusher().getEmail());
    return user;
  }

  public static User getUser(UserDto userDto) {
    User user = new User();
    BeanUtils.copyProperties(userDto, user);
    return user;
  }
}
