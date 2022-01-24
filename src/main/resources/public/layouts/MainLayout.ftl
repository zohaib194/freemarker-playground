[#include '../components/header/Header.ftl']

[#macro MainLayout title]
    <!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>${title!"Main layout"}</title>
            <link rel="stylesheet" href="layouts/MainLayout.css" />
        </head>

        <body class="main-layout">
            [@Header][/@Header]
            <h1 class="main-heading">This is Main Layout!</h1>

            [#nested]
        </body>
        <script src="layouts/MainLayout.js"></script>
    </html>
[/#macro]