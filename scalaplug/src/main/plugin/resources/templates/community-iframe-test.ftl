<html>
    <head>
        <#include '/template/global/include/community-head.ftl'/>
        <#include '/template/global/include/manage-category.ftl' />
    </head>
    <body class="jive-body-community jive-body-community-discussions">
        <#include '/template/global/include/community-header.ftl' />

        <!-- BEGIN main body -->
        <div id="jive-body-main">

        <p align="center">

        <#if frame?exists>    
            <iframe src="${frame}"
                    height="${JiveGlobals.getJiveProperty('thinkfinity.tims.height', '600px')}}"
                    width="${JiveGlobals.getJiveProperty('thinkfinity.tims.width', '970px')}}"
                    scrolling="no"/>
        <#else>
            <iframe src="${JiveGlobals.getJiveProperty('thinkfinity.tims.location', 'http://www.thinkfinity.com')}"
                    height="${JiveGlobals.getJiveProperty('thinkfinity.tims.height', '600px')}}"
                    width="${JiveGlobals.getJiveProperty('thinkfinity.tims.width', '970px')}}"
                    scrolling="no"/>
        </#if>`
        </p>

        </div>
    </body>
</html>