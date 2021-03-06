/**
 * This layout accepts the following parameters:
 *
 * @param pageTitle the page title
 * @param extraStyles , a list of CSS files to be added in the header
 * @param scripts , a list of scripts to be imported
 * @param contents the main page contents
 * @param extraFooter, a section to be added before closing body
 */

// main layout
yieldUnescaped '''<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->'''

html {
    head {
        meta charset: 'utf-8'
        meta 'http-equiv': 'X-UA-Compatible', content: 'IE=edge'
        meta name: 'viewport', content: "width=device-width, initial-scale=1"
        title(pageTitle)
        link(href: "img/favicon.ico", type: "image/x-ico", rel: "icon")
        link(href: "//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,800,600,300,700", type: "text/css", rel: "stylesheet")
        def styles = extraStyles ?: []
        ['bootstrap.css', 'font-awesome.min.css', 'style.css', *styles].each {
            link rel: 'stylesheet', type: 'text/css', href:
                    "css/$it"
        }
    }

    body {
        div(id: 'st-container', class: "st-container st-effect-9") {
            nav(class: "st-menu st-effect-9", id: "menu-12") {
                h2(class: "icon icon-lab", 'Socialize')
                ul {
                    menu['Socialize'].each {
                        def (text,url, style) = [it.name, it.link, it.style ]
                        li {
                            a(href: url, class: 'icon') { yieldUnescaped "<span class='fa $style'></span> $text" }
                        }
                    }
                }
            }

            // 'content push wrapper'

            div(class: 'st-pusher') {
                div(class: 'st-content') {
                    div(class: 'st-content-inner') {
                        yieldUnescaped '''<!--[if lt IE 7]>
                        <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
                    <![endif]-->'''
                        if (mainContent) {
                            mainContent()
                        }
                    }
                }
            }
        }

        def scripts = extraScripts ?: []
        ['vendor/jquery-1.10.2.min.js', 'vendor/classie.js', 'vendor/bootstrap.js', 'vendor/sidebarEffects.js', 'vendor/modernizr-2.6.2.min.js','plugins.js', *scripts].each {
            yieldUnescaped "<script src='js/$it' defer></script>"
        }

        if (extraFooter) {
            extraFooter()
        }

       
    }
}

