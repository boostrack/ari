
// footer
footer(id: 'footer') {
    div(class: 'row') {
        div(class: 'colset-3-footer') {
            menu.entrySet().eachWithIndex { entry, i ->
                def (name, menu) = [entry.key, entry.value]
                div(class: "col-${i+1}") {
                    h1(name)
                    ul {
                        menu.each { menuItem ->
                            li { a(href: menuItem.link, menuItem.name) }
                        }
                    }
                }
            }
            div(class: 'col-right') {
                p {
                    yield "tursfriend a tour friend company"; br()
                    yield "is supported by "; a(href: 'http://wwwfcporto.com', 'F. C . Porto'); br()
                    yield "and friends"; br()
                }
                img(src: 'img/pivotal.png', title: 'tursfriend', alt: 'tursfriend')
            }
        }
        div(class: 'clearfix', "&copy; ${Calendar.instance[Calendar.YEAR]} the tursfriend company")
    }
}