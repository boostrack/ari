
ul(class: 'nav-sidebar') {
    [
            'sponsors': 'Sponsors',
            'events': 'Events',
    ].each { page, label ->
        if (currentPage == page) {
            li(class: 'active') { a(href: "${page}.html") { strong(label) } }
        } else {
            li { a(href: "${page}.html", label) }
        }
    }
//    li { a(href: "groovy-weekly.html#subscribe", class: 'anchor-link', 'Subscribe') }
//    li { a(href: "groovy-weekly.html#archives", class: 'anchor-link', 'Archive') }
}
br()
include unescaped: 'html/twittersearch.html'
