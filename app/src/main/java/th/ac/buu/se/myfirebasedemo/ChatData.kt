package th.ac.buu.se.myfirebasedemo

import java.util.*


class ChatData {

    var messageText: String? = null
    var messageUser: String? = null
    var messageTime: Long = 0

    constructor(messageText: String, messageUser: String) {
        this.messageText = messageText
        this.messageUser = messageUser

        // Initialize to current time
        messageTime = Date().getTime()
    }

    constructor() {

    }
}