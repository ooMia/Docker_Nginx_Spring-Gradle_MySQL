CREATE DATABASE IF NOT EXISTS coupang;
USE coupang;

CREATE TABLE `product` (
                           `product_id`	int	NOT NULL,
                           `product_name`	varchar(255)	NULL,
    `product_price`	int	NULL
    );

CREATE TABLE `product_detail` (
                                  `id`	int	NOT NULL,
                                  `product_comment`	varchar(255)	NULL,
    `product_phone`	varchar(255)	NULL,
    `product_id`	int	NOT NULL
    );


CREATE TABLE `options` (
                           `id`	int	NOT NULL,
                           `url`	varchar(255)	NULL,
    `expired_time`	int	NULL
    );

ALTER TABLE `product` ADD CONSTRAINT `PK_PRODUCT` PRIMARY KEY (
    `product_id`
    );

ALTER TABLE `product_detail` ADD CONSTRAINT `PK_PRODUCT_DETAIL` PRIMARY KEY (
    `id`
    );

ALTER TABLE `options` ADD CONSTRAINT `PK_OPTIONS` PRIMARY KEY (
    `id`
    );
