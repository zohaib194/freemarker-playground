[#include '../components/header/Header.ftl']
[#include '../components/footer/Footer.ftl']

[#macro MainLayout title]
    <!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>${title!"Main layout"}</title>
            <link rel="stylesheet" href="layouts/MainLayout.css" />
        </head>

        <body class="start-page">
            [@Header][/@Header]
            <main class="main-content">
                [#nested]
            </main>
            [@Footer][/@Footer]
        </body>
        <script src="layouts/MainLayout.js"></script>
    </html>
[/#macro]