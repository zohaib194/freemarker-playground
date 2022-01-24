// Generated using webpack-cli https://github.com/webpack/webpack-cli

const path = require("path");
const MiniCssExtractPlugin = require('mini-css-extract-plugin');

const stylesHandler = "style-loader";

const public = path.resolve(__dirname, "src", "main", "resources", "public");
const outputPath = path.resolve(__dirname, "build", "resources", "main", "public");

const mode = (process.env.NODE_ENV && process.env.NODE_ENV === 'production') ? 'production' : 'development';

module.exports = {
  mode,
  devtool: 'inline-source-map',

  entry: {
    'layouts/MainLayout': `${public}/layouts/MainLayout.ts`,
    'screens/home/HomeScreen': `${public}/screens/home/HomeScreen.ts`,
  },
  output: {
    path: outputPath,
    filename: '[name].js'
  },
  plugins: [
    new MiniCssExtractPlugin({
      filename: '[name].css',
    }),
  ],
  module: {
    rules: [
      {
        test: /\.(ts|tsx)$/i,
        loader: "babel-loader",
      },
      {
        test: /\.css$/i,
        use: [stylesHandler, "css-loader"],
      },
      {
        test: /\.(sc|c)ss$/,
        use: ['style-loader', MiniCssExtractPlugin.loader, "css-loader", "sass-loader"],
      },
      {
        test: /\.(eot|svg|ttf|woff|woff2|png|jpg|gif)$/i,
        type: "asset",
      },

      // Add your rules for custom modules here
      // Learn more about loaders from https://webpack.js.org/loaders/
    ],
  },
  watchOptions: {
    ignored: ['node_modules']
  }
};