CREATE TABLE member
(
    id      BIGINT AUTO_INCREMENT PRIMARY KEY,
    name    VARCHAR(255) NOT NULL,
    user_id VARCHAR(255) NOT NULL
);

CREATE TABLE chat_room
(
    id   BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE chat_room_member
(
    id           BIGINT AUTO_INCREMENT PRIMARY KEY,
    member_id    BIGINT NOT NULL,
    chat_room_id BIGINT NOT NULL
);
