#stage 1
FROM node:alpine as build
WORKDIR /project
RUN npm install -g @angular/cli@14
COPY package.json package-lock.json ./
RUN npm install
COPY . .
RUN npm run build
#stage 2
FROM nginx:alpine
COPY --from=build /project/dist/client /usr/share/nginx/html
COPY nginx.conf /etc/nginx/conf.d/default.conf
EXPOSE 80

