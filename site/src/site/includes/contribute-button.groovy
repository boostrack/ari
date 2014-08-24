div(id: 'contribute-btn') {
    button(type: 'button', class: 'btn btn-default',
            onclick: "window.location.href=\"https://github.com/boostrack/ari/tree/gh-pages/${currentPage}.html\"") {
        i(class: 'fa fa-pencil-square-o') {}
        yield ' Improve this page'
    }
}