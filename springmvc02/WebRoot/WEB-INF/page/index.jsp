<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/hx.css">
    <title>华鑫证券融资融券邮件系统</title>
</head>
<body>
    <div class="m_container">
        <div class="m_header">
            <!-- logo and search -->
            <img src="images/logo.png" alt="" class="m_logo">
            <div class="m_hSearch">
                <input type="text" placeholder="搜索电子邮件">
                <a class="m_searBtn"><img src="images/hSearch.png" alt=""></a>
            </div>

            <!-- 头部操作区 -->
            <div class="m_headRight">
                <ul>
                    <li>
                        ADMIN
                    </li>
                    <li>
                        <a href="index.html"><img src="images/home.png" alt=""></a>
                    </li>
                    <li>
                        <a><img src="images/logou.png" alt=""></a>
                    </li>
                </ul>
            </div>
            <div class="clear"></div>
        </div>
        <div class="m_mainer">
            <!-- 左侧菜单 -->
            <div class="m_menuLeft" id="xdMenu">
                <div class="m_write">
                    <ul>
                        <li>
                            <img src="images/img1.png" alt="">
                            <a href="page1.html">链接1</a>
                        </li>
                        <li>
                            <img src="images/img1.png" alt="">
                            <a href="page2.html">链接2</a>
                        </li>
                        <li>
                            <img src="images/img1.png" alt="">
                            <a href="receiveLetters.html">链接3</a>
                        </li>
                        <li>
                            <img src="images/img1.png" alt="">
                            <a>写信</a>
                        </li>
                        <li class="active">
                            <img src="images/img2.png" alt="">
                            <a>收信</a>
                        </li>
                        <li>
                            <img src="images/img3.png" alt="">
                            <a>调整授信额度菜单</a>
                        </li>
                    </ul>
                </div>

                <div class="m_mail">
                    <ul>
                        <li>待办邮件</li>
                        <li>星标邮件</li>
                        <li>已发送</li>
                        <li>草稿箱</li>
                        <li>通讯录</li>
                    </ul>
                </div>
            </div>
            <!-- 右侧主体 -->
            <div class="m_conRight">
                <div class="m_bread">
                    <div class="m_hello">
                        <span>ADMIN</span>
                        <span>XXXXXXX@XXXX.COM</span>
                        <span>下午好</span>
                    </div>
                </div>
                <div class="m_content">
                    <div class="m_content_top">
                        <div class="m_mainNum">
                            <span>未读邮件 (<a>200</a>)</span>
                            <span>星标邮件 (<a>200</a>)</span>
                            <span>草稿箱 (<a>299</a>)</span>
                        </div>
                        <div class="m_mailTotal">总邮件10000封</div>
                        <div class="clear"></div>
                    </div>
                    <div class="m_content_body">
                        <div class="m_left">
                            <!-- 广告图 -->
                            <div class="m_banner">
                                <!-- <img src="images/banner.png" alt="" > -->
                            </div>
                            
                            <!-- 公告板 -->
                            <div class="m_notice" id="noticetHeight">
                                <p class="m_notiTitle">
                                    公告板
                                </p>
                                <div class="m_notList">
                                    <ul>
                                        <li>
                                            <a>如何进一步加强平安中国建设，让人民群众安全感满意度进一步提</a>
                                            <span>2020-10-20</span>
                                        </li>
                                        <li>
                                            <a>如何进一步加强平安中国建设，让人民群众安全感满意度进一步提</a>
                                            <span>2020-10-20</span>
                                        </li>
                                        <li>
                                            <a>如何进一步加强平安中国建设，让人民群众安全感满意度进一步提</a>
                                            <span>2020-10-20</span>
                                        </li>
                                        <li>
                                            <a>如何进一步加强平安中国建设，让人民群众安全感满意度进一步提</a>
                                            <span>2020-10-20</span>
                                        </li>
                                        <li>
                                            <a>如何进一步加强平安中国建设，让人民群众安全感满意度进一步提</a>
                                            <span>2020-10-20</span>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>


                        <div class="m_right">
                            <!-- 最新公告 -->
                            <div class="m_notice" id="newHeight">
                                <p class="m_notiTitle">
                                    最新公告
                                </p>
                                <div class="m_notList">
                                    <ul>
                                        <li>
                                            <a>如何进一步加强平安中国建设，让人民群众安全感满意度进一步提</a>
                                            <span>2020-10-20</span>
                                        </li>
                                        <li>
                                            <a>如何进一步加强平安中国建设，让人民群众安全感满意度进一步提</a>
                                            <span>2020-10-20</span>
                                        </li>
                                        <li>
                                            <a>如何进一步加强平安中国建设，让人民群众安全感满意度进一步提</a>
                                            <span>2020-10-20</span>
                                        </li>
                                        <li>
                                            <a>如何进一步加强平安中国建设，让人民群众安全感满意度进一步提</a>
                                            <span>2020-10-20</span>
                                        </li>
                                        <li>
                                            <a>如何进一步加强平安中国建设，让人民群众安全感满意度进一步提</a>
                                            <span>2020-10-20</span>
                                        </li>
                                        <li>
                                            <a>如何进一步加强平安中国建设，让人民群众安全感满意度进一步提</a>
                                            <span>2020-10-20</span>
                                        </li>
                                        <li>
                                            <a>如何进一步加强平安中国建设，让人民群众安全感满意度进一步提</a>
                                            <span>2020-10-20</span>
                                        </li>
                                        <li>
                                            <a>如何进一步加强平安中国建设，让人民群众安全感满意度进一步提</a>
                                            <span>2020-10-20</span>
                                        </li>
                                        <li>
                                            <a>如何进一步加强平安中国建设，让人民群众安全感满意度进一步提</a>
                                            <span>2020-10-20</span>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="clear"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
   <script src="js/jquery.min.js"></script>
   <script src="js/xdMail.js"></script>
</body>
</html>