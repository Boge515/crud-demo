CREATE TABLE `user` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `name` varchar(20) DEFAULT NULL COMMENT '姓名',
    `age` int(11) DEFAULT NULL COMMENT '年龄',
    `sex` varchar(1) DEFAULT NULL COMMENT '性别',
    `address` varchar(255) DEFAULT NULL COMMENT '地址',
    `phone` varchar(20) DEFAULT NULL COMMENT '电话',
    `create_time` varchar(20) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
