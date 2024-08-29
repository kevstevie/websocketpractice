CREATE TABLE member
(
    id   BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
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

CREATE TABLE message
(
    id           BIGINT AUTO_INCREMENT PRIMARY KEY,
    member_id    BIGINT       NOT NULL,
    text         VARCHAR(255) NOT NULL,
    time         TIMESTAMP    NOT NULL,
    chat_room_id BIGINT       NOT NULL
);
