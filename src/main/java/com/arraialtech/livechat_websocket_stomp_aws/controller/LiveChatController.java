package com.arraialtech.livechat_websocket_stomp_aws.controller;

import com.arraialtech.livechat_websocket_stomp_aws.domain.ChatInput;
import com.arraialtech.livechat_websocket_stomp_aws.domain.ChatOutput;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class LiveChatController {

    @MessageMapping("/new-message")
    @SendTo("/topics/livechat")
    public ChatOutput newMessage(ChatInput input){
        return new ChatOutput(HtmlUtils.htmlEscape(input.user() + ": " + input.message()));
    }
}
