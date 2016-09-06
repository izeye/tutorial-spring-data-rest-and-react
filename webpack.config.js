module.exports = {
  entry: "./src/main/resources/scripts/js/app.js",
  output: {
    path: __dirname,
    filename: "./src/main/resources/public/js/bundle.js"
  },
  module: {
    loaders: [
      {
        test: /\.css$/,
        loader: "style!css"
      },
      {
        test: /\.js$/,
        loader: 'babel',
        query: {
          presets: ['react']
        }
      }
    ]
  }
};
