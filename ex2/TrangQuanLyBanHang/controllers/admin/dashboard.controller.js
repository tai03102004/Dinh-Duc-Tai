// [GET] admin123/dashboard
module.exports.dashboard = (req, res) => {
    res.render("admin/pages/dashboard/index.pug",{
        pageTitle: "Tổng quan"
    })
}